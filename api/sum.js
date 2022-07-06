export default function handler(req, res) {
  const x = parseInt(req.query.x);
  const y = parseInt(req.query.y);
  res.status(200).json({ sum: x+y })
}
