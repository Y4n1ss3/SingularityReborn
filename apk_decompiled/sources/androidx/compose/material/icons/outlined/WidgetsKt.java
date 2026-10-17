package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WidgetsKt {
    private static ImageVector _widgets;

    public static final ImageVector getWidgets(Icons.Outlined outlined) {
        ImageVector imageVector = _widgets;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Widgets", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.66f, 4.52f, 2.83f, 2.83f);
        e.lineToRelative(-2.83f, 2.83f);
        e.lineToRelative(-2.83f, -2.83f);
        e.lineToRelative(2.83f, -2.83f);
        e.moveTo(9.0f, 5.0f);
        e.verticalLineToRelative(4.0f);
        e.lineTo(5.0f, 9.0f);
        e.lineTo(5.0f, 5.0f);
        e.horizontalLineToRelative(4.0f);
        e.moveToRelative(10.0f, 10.0f);
        e.verticalLineToRelative(4.0f);
        kf0.x(e, -4.0f, -4.0f, 4.0f);
        e.moveTo(9.0f, 15.0f);
        bv.q(e, 4.0f, 5.0f, 19.0f, -4.0f);
        e.horizontalLineToRelative(4.0f);
        e.moveToRelative(7.66f, -13.31f);
        e.lineTo(11.0f, 7.34f);
        e.lineTo(16.66f, 13.0f);
        fc.C(e, 5.66f, -5.66f, -5.66f, -5.65f);
        e.moveTo(11.0f, 3.0f);
        af0.m(e, 3.0f, 3.0f, 8.0f, 8.0f);
        uo.l(e, 11.0f, 3.0f, 21.0f, 13.0f);
        gy.D(e, -8.0f, 8.0f, 8.0f, -8.0f);
        e.moveTo(11.0f, 13.0f);
        af0.m(e, 3.0f, 13.0f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(e, -8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _widgets = build;
        build.getClass();
        return build;
    }
}
