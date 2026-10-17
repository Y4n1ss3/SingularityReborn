package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.iy;
import defpackage.y80;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultPagerState extends PagerState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<DefaultPagerState, ?> Saver = ListSaverKt.listSaver(new a(), new b());
    private MutableState<iy> pageCountState;

    public DefaultPagerState(int i, float f, iy iyVar) {
        super(i, f);
        this.pageCountState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iyVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(SaverScope saverScope, DefaultPagerState defaultPagerState) {
        return y80.E(Integer.valueOf(defaultPagerState.getCurrentPage()), Float.valueOf(y80.g(defaultPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.getPageCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultPagerState Saver$lambda$1(final List list) {
        Object obj = list.get(0);
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        obj2.getClass();
        return new DefaultPagerState(intValue, ((Float) obj2).floatValue(), new iy() { // from class: androidx.compose.foundation.pager.c
            @Override // defpackage.iy
            public final Object invoke() {
                int Saver$lambda$1$0;
                Saver$lambda$1$0 = DefaultPagerState.Saver$lambda$1$0(list);
                return Integer.valueOf(Saver$lambda$1$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Saver$lambda$1$0(List list) {
        Object obj = list.get(2);
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return ((Number) this.pageCountState.getValue().invoke()).intValue();
    }

    public final MutableState<iy> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(MutableState<iy> mutableState) {
        this.pageCountState = mutableState;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<DefaultPagerState, ?> getSaver() {
            return DefaultPagerState.Saver;
        }

        private Companion() {
        }
    }
}
