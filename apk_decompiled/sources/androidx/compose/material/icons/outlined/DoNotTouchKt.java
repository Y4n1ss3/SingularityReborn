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
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.Outlined outlined) {
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoNotTouch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.81f, 2.81f, 1.39f, 4.22f);
        i.lineTo(7.0f, 9.83f);
        i.lineToRelative(0.0f, 4.3f);
        i.lineToRelative(-2.6f, -1.48f);
        i.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        i.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        i.lineTo(2.0f, 13.88f);
        i.lineToRelative(6.8f, 7.18f);
        i.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        i.horizontalLineTo(17.0f);
        i.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.66f, -0.52f);
        i.lineToRelative(1.12f, 1.12f);
        gy.B(i, 1.41f, -1.41f, 2.81f, 2.81f);
        i.moveTo(17.0f, 20.0f);
        i.horizontalLineToRelative(-6.0f);
        i.curveToRelative(-0.39f, 0.0f, -0.64f, -0.23f, -0.75f, -0.36f);
        i.lineTo(6.87f, 16.0f);
        i.horizontalLineTo(9.0f);
        i.lineToRelative(0.0f, -4.17f);
        i.lineToRelative(8.14f, 8.14f);
        i.curveTo(17.09f, 19.98f, 17.05f, 20.0f, 17.0f, 20.0f);
        c21.d(i, 13.83f, 11.0f, 14.0f, 3.25f);
        i.curveTo(14.0f, 2.56f, 14.56f, 2.0f, 15.25f, 2.0f);
        i.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        uf.z(i, 11.0f, 1.0f, 5.25f);
        i.curveTo(17.5f, 4.56f, 18.06f, 4.0f, 18.75f, 4.0f);
        i.reflectiveCurveTo(20.0f, 4.56f, 20.0f, 5.25f);
        k4.z(i, 11.92f, -2.0f, -2.0f, 13.0f);
        gy.n(i, -2.17f, 13.83f, 11.0f);
        i.moveTo(13.0f, 10.17f);
        i.verticalLineTo(2.25f);
        i.curveTo(13.0f, 1.56f, 12.44f, 1.0f, 11.75f, 1.0f);
        i.reflectiveCurveTo(10.5f, 1.56f, 10.5f, 2.25f);
        kf0.t(i, 5.42f, 13.0f, 10.17f);
        i.moveTo(9.5f, 6.67f);
        i.verticalLineTo(4.25f);
        i.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        i.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(i, 0.0f, 9.5f, 6.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = build;
        build.getClass();
        return build;
    }
}
