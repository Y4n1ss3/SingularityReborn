package androidx.compose.foundation;

import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.lb0;
import defpackage.my;
import defpackage.ob0;
import defpackage.p10;
import defpackage.z10;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final lb0 mutex = new ob0();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Mutator {
        private final z10 job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, z10 z10Var) {
            this.priority = mutatePriority;
            this.job = z10Var;
        }

        public final boolean canInterrupt(Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            this.job.cancel(new MutationInterruptedException());
        }

        public final z10 getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, ky kyVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, kyVar, hmVar);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, myVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        while (true) {
            Mutator mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            AtomicReference<Mutator> atomicReference = this.currentMutator;
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.cancel();
                return;
            }
            return;
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, ky kyVar, hm hmVar) {
        return p10.n(new MutatorMutex$mutate$2(mutatePriority, this, kyVar, null), hmVar);
    }

    public final <T, R> Object mutateWith(T t, MutatePriority mutatePriority, my myVar, hm hmVar) {
        return p10.n(new MutatorMutex$mutateWith$2(mutatePriority, this, myVar, t, null), hmVar);
    }

    public final boolean tryLock() {
        return ((ob0) this.mutex).e();
    }

    public final boolean tryMutate(iy iyVar) {
        boolean tryLock = tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            iyVar.invoke();
            return tryLock;
        } finally {
            unlock();
        }
    }

    public final void unlock() {
        ((ob0) this.mutex).f(null);
    }
}
