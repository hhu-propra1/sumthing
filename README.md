# Sumthing

[![Deploy with Vercel](https://vercel.com/button)](https://vercel.com/new/clone?repository-url=https%3A%2F%2Fgithub.com%2Fn2o%2Fsumthing)

Sum up two numbers. Uses a serverless function deployed to vercel for
calculation.

## Development

### Frontend

If the frontend changes, use babashka to build a new html file:

    bb site.clj

If you start and connect to a babashka REPL, the html file is automatically
generated when you evaluate the file.

### Backend

Deliver the generated frontend and a node-backend to deploy the
serverless-functions with:

    vercel dev

## Production

Do a production build with:

    vercel --prod
