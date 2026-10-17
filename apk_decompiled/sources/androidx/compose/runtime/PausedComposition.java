package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PausedComposition {
    void apply();

    void cancel();

    boolean isApplied();

    boolean isCancelled();

    boolean isComplete();

    boolean resume(ShouldPauseCallback shouldPauseCallback);
}
