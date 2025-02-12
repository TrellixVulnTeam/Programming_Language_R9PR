import '../style/ReduxCounter.scss';

function ReduxCounter({ number, onIncrease, onDecrease }) {
  return (
    <div className="ReduxCounter">
      <h1>{number}</h1>
      <div>
        <button onClick={onIncrease}>+1</button>
        <button onClick={onDecrease}>-1</button>
      </div>
    </div>
  )
}

export default ReduxCounter;