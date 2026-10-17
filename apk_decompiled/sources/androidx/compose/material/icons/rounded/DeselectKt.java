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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeselectKt {
    private static ImageVector _deselect;

    public static final ImageVector getDeselect(Icons.Rounded rounded) {
        ImageVector imageVector = _deselect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Deselect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(3.0f, 13.0f, 2.0f, -2.0f, 3.0f);
        k4.D(d, 13.0f, 7.0f, 21.0f, 2.0f);
        gy.s(d, -2.0f, 7.0f, 21.0f);
        k4.C(d, 13.0f, 3.0f, -2.0f, 2.0f);
        uo.r(d, 2.0f, 3.0f, 19.0f, 3.0f);
        d.verticalLineToRelative(2.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        af0.A(d, 5.0f, 21.0f, -2.0f, 3.0f);
        d.curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f);
        r6.B(d, 3.0f, 17.0f, 2.0f, -2.0f);
        bv.s(d, 3.0f, 17.0f, 11.0f, 21.0f);
        bv.l(d, 2.0f, -2.0f, -2.0f, 21.0f);
        k4.C(d, 19.0f, 13.0f, 2.0f, -2.0f);
        uo.r(d, -2.0f, 13.0f, 19.0f, 9.0f);
        j50.D(d, 2.0f, 7.0f, -2.0f, 9.0f);
        j50.y(d, 15.0f, 5.0f, 2.0f, 3.0f);
        uo.r(d, -2.0f, 5.0f, 7.83f, 5.0f);
        fc.t(d, 7.0f, 4.17f, 3.0f, 2.0f);
        kf0.n(d, 2.0f, 7.83f, 19.83f, 17.0f);
        fc.t(d, 19.0f, 16.17f, 15.0f, 2.0f);
        kf0.n(d, 2.0f, 19.83f, 9.0f, 15.0f);
        d.verticalLineToRelative(-3.17f);
        d.lineTo(12.17f, 15.0f);
        d.horizontalLineTo(9.0f);
        d.close();
        d.moveTo(2.1f, 3.51f);
        d.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        r6.w(d, 4.17f, 7.0f, 3.0f, 2.0f);
        bv.w(d, 2.0f, 7.83f, 2.0f, 2.0f);
        d.verticalLineTo(16.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        r6.t(d, 6.17f, 2.0f, 2.0f, 15.0f);
        kf0.z(d, 2.0f, 2.0f, -1.17f);
        d.lineToRelative(2.07f, 2.07f);
        d.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        d.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        d.lineTo(3.51f, 3.51f);
        d.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        d.close();
        d.moveTo(17.0f, 8.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        fc.z(d, 9.83f, 2.0f, 2.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.n(d, 3.17f, 2.0f, 2.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deselect = build;
        build.getClass();
        return build;
    }
}
