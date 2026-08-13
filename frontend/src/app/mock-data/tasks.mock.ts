import { Task } from '../models/task.model';

export const TASKS_MOCK: Task[] = [
  {
    id: 1,
    nome: 'Instalação Portão Basculante',
    status: 'Em andamento',
    prioridade: 'Alta',
    valor: 2450,
    descricao: 'Instalação de portão basculante 2,5m com motor PPA e controle remoto.',
    produtos: [
      { nome: 'Motor PPA 1/4', quantidade: 1, valor: 950 },
      { nome: 'Portão Basculante 2,5m', quantidade: 1, valor: 1200 },
      { nome: 'Controle Remoto', quantidade: 2, valor: 150 }
    ]
  },
  {
    id: 2,
    nome: 'Manutenção Portão Eletrônico',
    status: 'Aguardando',
    prioridade: 'Média',
    valor: 350,
    descricao: 'Manutenção preventiva e ajuste geral do motor.',
    produtos: []
  },
  {
    id: 3,
    nome: 'Instalação Portão Deslizante',
    status: 'Concluída',
    prioridade: 'Baixa',
    valor: 4800,
    descricao: 'Instalação completa com motor e sensores.',
    produtos: []
  }
];