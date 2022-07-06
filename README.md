# Sumthing

[![Deploy with Vercel](https://vercel.com/button)](https://vercel.com/new/clone?repository-url=https%3A%2F%2Fgithub.com%2Fn2o%2Fsumthing)

Sum up two numbers. Uses a serverless function deployed to vercel for
calculation.

## Development

### Frontend

Develop the frontend with babashka. Edit `site.clj` and then generate the html
file via REPL or with this command:

    bb site.clj

### Backend

Deliver the generated frontend and a node-backend to deploy the
serverless-functions with:

    vercel dev

## Production

Do a production build with:

    vercel --prod
