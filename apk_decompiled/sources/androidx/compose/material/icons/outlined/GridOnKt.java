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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GridOnKt {
    private static ImageVector _gridOn;

    public static final ImageVector getGridOn(Icons.Outlined outlined) {
        ImageVector imageVector = _gridOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GridOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 2.0f, 4.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 8.0f, 20.0f, 4.0f, 20.0f);
        r6.p(i, -4.0f, 4.0f, 4.0f);
        i.moveTo(8.0f, 14.0f);
        af0.m(i, 4.0f, 14.0f, -4.0f, 4.0f);
        r6.l(i, 4.0f, 8.0f, 8.0f);
        i.lineTo(4.0f, 8.0f);
        r6.m(i, 4.0f, 4.0f, 4.0f, 4.0f);
        k4.C(i, 14.0f, 20.0f, -4.0f, -4.0f);
        fc.x(i, 4.0f, 4.0f, 14.0f, 14.0f);
        gy.D(i, -4.0f, -4.0f, 4.0f, 4.0f);
        i.moveTo(14.0f, 8.0f);
        uo.n(i, -4.0f, 10.0f, 4.0f, 4.0f);
        bv.m(i, 4.0f, 20.0f, 20.0f, -4.0f);
        r6.p(i, -4.0f, 4.0f, 4.0f);
        k4.C(i, 20.0f, 14.0f, -4.0f, -4.0f);
        fc.x(i, 4.0f, 4.0f, 20.0f, 8.0f);
        uo.n(i, -4.0f, 16.0f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridOn = build;
        build.getClass();
        return build;
    }
}
