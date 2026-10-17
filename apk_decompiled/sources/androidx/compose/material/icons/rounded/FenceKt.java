package androidx.compose.material.icons.rounded;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FenceKt {
    private static ImageVector _fence;

    public static final ImageVector getFence(Icons.Rounded rounded) {
        ImageVector imageVector = _fence;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fence", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 11.0f, 21.0f, 11.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        bv.w(i, -1.0f, 7.0f, -2.29f, -2.29f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineTo(14.0f, 6.0f);
        i.lineToRelative(-1.29f, -1.29f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineTo(10.0f, 6.0f);
        i.lineTo(8.71f, 4.71f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        kf0.u(i, 5.0f, 7.0f, 3.0f, 4.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        k4.k(i, 1.0f, 2.0f, 4.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(1.0f);
        i.verticalLineToRelative(3.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-3.0f);
        i.horizontalLineToRelative(1.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kf0.x(i, -1.0f, -2.0f, 1.0f);
        i.curveTo(20.55f, 12.0f, 21.0f, 11.55f, 21.0f, 11.0f);
        k4.x(i, 16.0f, 6.83f, 1.0f, 1.0f);
        uf.z(i, 10.0f, -2.0f, 7.83f);
        gy.B(i, 0.41f, -0.41f, 16.0f, 6.83f);
        i.moveTo(12.0f, 6.83f);
        i.lineToRelative(0.59f, 0.59f);
        fc.t(i, 13.0f, 7.83f, 10.0f, -2.0f);
        i.verticalLineTo(7.83f);
        gy.B(i, 0.41f, -0.41f, 12.0f, 6.83f);
        bv.y(i, 11.0f, 14.0f, -2.0f, 2.0f);
        kf0.n(i, 2.0f, 11.0f, 13.0f, 16.0f);
        fc.y(i, 2.0f, -2.0f, -2.0f, 13.0f);
        i.moveTo(7.0f, 7.83f);
        i.lineToRelative(1.0f, -1.0f);
        i.lineToRelative(0.59f, 0.59f);
        uf.u(i, 9.0f, 7.83f, 10.0f, 7.0f);
        k4.D(i, 7.83f, 7.0f, 12.0f, 2.0f);
        gy.s(i, 2.0f, 7.0f, 12.0f);
        k4.C(i, 7.0f, 16.0f, 2.0f, 2.0f);
        bv.s(i, 7.0f, 16.0f, 17.0f, 18.0f);
        bv.l(i, -2.0f, -2.0f, 2.0f, 18.0f);
        k4.C(i, 17.0f, 14.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fence = build;
        build.getClass();
        return build;
    }
}
