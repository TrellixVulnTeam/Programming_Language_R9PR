export default function SearchInput({ $target, setResult, setHistory }) {
  if (!new.target) {
    throw new Error('Not used new keyword!!');
  }

  this.$element = document.createElement('div');
  $target.prepend(this.$element);
  this.$element.innerHTML = `
    <form>
      <label> 검색
      <input type="search" id="search-keyword" />
      </label>
    </form>
  `;

  this.render = () => {};
  this.setState = () => {};

  const searchKeyword = document.querySelector('#search-keyword');
  let timer;

  searchKeyword.addEventListener('keyup', (e) => {
    if (timer) {
      clearTimeout(timer);
    }

    timer = setTimeout(async () => {
      if (e.target.value === '') {
        return;
      }

      const url = `https://api.idiots.band/api/search?keyword=${e.target.value}`;
      const response = await fetch(url);

      if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
      }
      
      const data = await response.json();

      setResult(data);
      setHistory(e.target.value);
    }, 500);
  });
}
