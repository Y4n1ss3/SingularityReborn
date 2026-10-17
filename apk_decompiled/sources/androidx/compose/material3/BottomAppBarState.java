package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.ed;
import defpackage.w4;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface BottomAppBarState {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Saver<BottomAppBarState, ?> Saver = ListSaverKt.listSaver(new w4(5), new ed(6));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, BottomAppBarState bottomAppBarState) {
            return y80.E(Float.valueOf(bottomAppBarState.getHeightOffsetLimit()), Float.valueOf(bottomAppBarState.getHeightOffset()), Float.valueOf(bottomAppBarState.getContentOffset()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BottomAppBarState Saver$lambda$1(List list) {
            return AppBarKt.BottomAppBarState(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }

        public final Saver<BottomAppBarState, ?> getSaver() {
            return Saver;
        }
    }

    float getCollapsedFraction();

    float getContentOffset();

    float getHeightOffset();

    float getHeightOffsetLimit();

    void setContentOffset(float f);

    void setHeightOffset(float f);

    void setHeightOffsetLimit(float f);
}
