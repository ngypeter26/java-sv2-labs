package enumabstract;

public enum  TransactionStateInterface implements HasCompleteState{
    SUCCESS {
        @Override
        public boolean isComplete() {
            return true;
        }
    }, REJECTED {
        @Override
        public boolean isComplete() {
            return true;
        }
    }, PENDING {
        @Override
        public boolean isComplete() {
            return false;
        }
    }
}
