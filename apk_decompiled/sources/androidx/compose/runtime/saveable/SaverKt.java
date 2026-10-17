package androidx.compose.runtime.saveable;

import defpackage.je0;
import defpackage.ky;
import defpackage.my;
import defpackage.n30;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(new n30(11), new je0(15));

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(final my myVar, final ky kyVar) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return (Original) kyVar.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) my.this.invoke(saverScope, original);
            }
        };
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        saver.getClass();
        return saver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AutoSaver$lambda$1(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AutoSaver$lambda$0(SaverScope saverScope, Object obj) {
        return obj;
    }
}
