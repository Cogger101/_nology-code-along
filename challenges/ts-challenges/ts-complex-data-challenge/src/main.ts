import { Company, companies } from "./data";

const companiesBtn =
    document.querySelector<HTMLButtonElement>("#render-companies");

console.log(companiesBtn);

const companiesContainer = document.querySelector<HTMLDivElement>(
    "#companies-container"
);
console.log(companiesContainer);

if (!companiesBtn) {
    throw new Error("Can't find element");
}

const renderCompanies = (companies: Company[]) => {
    if (!companiesContainer) {
        throw new Error("Can't find element");
    }
    companiesContainer.innerHTML = "";
    companies.forEach((company) => {
        const companyCard = document.createElement("div");
        companyCard.classList.add("card");
        companyCard.innerHTML = `<h2>${company.name}</h2>
        <p>Industry: ${company.industry}</p>
        <p>Start: ${company.start}</p>
        <p>End: ${company.end}</p>`;
        companiesContainer.appendChild(companyCard);
    });
};

companiesBtn.addEventListener("click", () => {
    renderCompanies(companies);
});

// const handleRender = () => {
// companiesContainer.innerHTML = ""
//     companies.forEach(({name, industry, start, end})=>{
//         `<div>
//         <h2>${name}</h2>
//         <p>${industry}</p>
//         <p>${start}</p>
//         <p>${end}</p>
//         </div>`;
//     })
// }

// companiesBtn.addEventListener('click', handleRender)
