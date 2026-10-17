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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RouterKt {
    private static ImageVector _router;

    public static final ImageVector getRouter(Icons.Rounded rounded) {
        ImageVector imageVector = _router;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Router", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.45f, 5.55f);
        b.curveToRelative(0.19f, 0.19f, 0.5f, 0.21f, 0.72f, 0.04f);
        b.curveTo(13.3f, 4.69f, 14.65f, 4.2f, 16.0f, 4.2f);
        b.reflectiveCurveToRelative(2.7f, 0.49f, 3.84f, 1.39f);
        b.curveToRelative(0.21f, 0.17f, 0.52f, 0.15f, 0.72f, -0.04f);
        b.lineToRelative(0.04f, -0.05f);
        b.curveToRelative(0.22f, -0.22f, 0.21f, -0.59f, -0.03f, -0.8f);
        b.curveTo(19.24f, 3.57f, 17.62f, 3.0f, 16.0f, 3.0f);
        b.reflectiveCurveToRelative(-3.24f, 0.57f, -4.57f, 1.7f);
        b.curveToRelative(-0.24f, 0.21f, -0.26f, 0.57f, -0.03f, 0.8f);
        fc.B(b, 0.05f, 0.05f, 13.15f, 6.31f);
        b.curveToRelative(-0.25f, 0.2f, -0.26f, 0.58f, -0.04f, 0.8f);
        b.lineToRelative(0.04f, 0.04f);
        b.curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.72f, 0.04f);
        b.curveToRelative(0.63f, -0.48f, 1.38f, -0.69f, 2.13f, -0.69f);
        b.reflectiveCurveToRelative(1.5f, 0.21f, 2.13f, 0.68f);
        b.curveToRelative(0.22f, 0.17f, 0.53f, 0.16f, 0.72f, -0.04f);
        b.lineToRelative(0.04f, -0.04f);
        b.curveToRelative(0.23f, -0.23f, 0.21f, -0.6f, -0.04f, -0.8f);
        b.curveToRelative(-0.83f, -0.64f, -1.84f, -1.0f, -2.85f, -1.0f);
        b.reflectiveCurveToRelative(-2.02f, 0.36f, -2.85f, 1.01f);
        r6.B(b, 19.0f, 13.0f, -2.0f, -3.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.lineTo(5.0f, 13.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(b, 8.0f, 18.0f, 6.0f, 18.0f);
        r6.p(b, -2.0f, 2.0f, 2.0f);
        k4.C(b, 11.5f, 18.0f, -2.0f, -2.0f);
        fc.x(b, 2.0f, 2.0f, 15.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(b, -2.0f, -2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _router = build;
        build.getClass();
        return build;
    }
}
