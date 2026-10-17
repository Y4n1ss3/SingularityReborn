package androidx.compose.material3;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements iy {
    public final /* synthetic */ int d;

    public /* synthetic */ w(int i) {
        this.d = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        float invoke$lambda$3$lambda$2$lambda$0;
        float invoke$lambda$3$lambda$2$lambda$1;
        float invoke$lambda$5$lambda$4$lambda$2;
        float invoke$lambda$5$lambda$4$lambda$3;
        boolean _init_$lambda$0;
        boolean _init_$lambda$02;
        boolean _init_$lambda$03;
        boolean _init_$lambda$04;
        switch (this.d) {
            case 0:
                invoke$lambda$3$lambda$2$lambda$0 = DatePickerKt$HorizontalMonthsList$1.invoke$lambda$3$lambda$2$lambda$0();
                return Float.valueOf(invoke$lambda$3$lambda$2$lambda$0);
            case 1:
                invoke$lambda$3$lambda$2$lambda$1 = DatePickerKt$HorizontalMonthsList$1.invoke$lambda$3$lambda$2$lambda$1();
                return Float.valueOf(invoke$lambda$3$lambda$2$lambda$1);
            case 2:
                invoke$lambda$5$lambda$4$lambda$2 = DateRangePickerKt$VerticalMonthsList$1.invoke$lambda$5$lambda$4$lambda$2();
                return Float.valueOf(invoke$lambda$5$lambda$4$lambda$2);
            case 3:
                invoke$lambda$5$lambda$4$lambda$3 = DateRangePickerKt$VerticalMonthsList$1.invoke$lambda$5$lambda$4$lambda$3();
                return Float.valueOf(invoke$lambda$5$lambda$4$lambda$3);
            case 4:
                _init_$lambda$0 = EnterAlwaysScrollBehavior._init_$lambda$0();
                return Boolean.valueOf(_init_$lambda$0);
            case 5:
                _init_$lambda$02 = ExitAlwaysScrollBehavior._init_$lambda$0();
                return Boolean.valueOf(_init_$lambda$02);
            case 6:
                _init_$lambda$03 = ExitUntilCollapsedScrollBehavior._init_$lambda$0();
                return Boolean.valueOf(_init_$lambda$03);
            default:
                _init_$lambda$04 = PinnedScrollBehavior._init_$lambda$0();
                return Boolean.valueOf(_init_$lambda$04);
        }
    }
}
