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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DialerSipKt {
    private static ImageVector _dialerSip;

    public static final ImageVector getDialerSip(Icons.Rounded rounded) {
        ImageVector imageVector = _dialerSip;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DialerSip", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.5f, 8.0f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        b.close();
        b.moveTo(12.5f, 7.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.horizontalLineToRelative(1.95f);
        b.curveToRelative(0.3f, 0.0f, 0.55f, -0.25f, 0.55f, -0.55f);
        b.verticalLineToRelative(-1.9f);
        b.curveToRelative(0.0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f);
        b.lineTo(13.0f, 5.0f);
        b.lineTo(13.0f, 4.0f);
        b.horizontalLineToRelative(1.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.horizontalLineToRelative(-1.95f);
        b.curveToRelative(-0.3f, 0.0f, -0.55f, 0.25f, -0.55f, 0.55f);
        b.verticalLineToRelative(1.89f);
        b.curveToRelative(0.0f, 0.31f, 0.25f, 0.56f, 0.55f, 0.56f);
        kp0.x(b, 14.0f, 6.0f, 1.0f, -1.5f);
        b.moveTo(20.45f, 3.0f);
        b.horizontalLineToRelative(-1.89f);
        b.curveToRelative(-0.31f, 0.0f, -0.56f, 0.25f, -0.56f, 0.55f);
        b.lineTo(18.0f, 7.5f);
        b.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.lineTo(19.0f, 6.0f);
        b.horizontalLineToRelative(1.45f);
        b.curveToRelative(0.3f, 0.0f, 0.55f, -0.25f, 0.55f, -0.55f);
        b.verticalLineToRelative(-1.9f);
        b.curveToRelative(0.0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f);
        af0.l(b, 20.0f, 5.0f, -1.0f);
        r6.m(b, 19.0f, 4.0f, 1.0f, 1.0f);
        b.moveTo(19.21f, 15.27f);
        b.lineToRelative(-2.54f, -0.29f);
        b.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        b.lineToRelative(-1.84f, 1.84f);
        b.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        b.lineToRelative(1.85f, -1.85f);
        b.curveToRelative(0.43f, -0.43f, 0.64f, -1.04f, 0.57f, -1.64f);
        b.lineToRelative(-0.29f, -2.52f);
        b.curveToRelative(-0.11f, -1.01f, -0.97f, -1.78f, -1.98f, -1.78f);
        b.lineTo(5.02f, 3.01f);
        b.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        b.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        b.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        b.verticalLineToRelative(-1.73f);
        b.curveToRelative(0.01f, -1.0f, -0.76f, -1.86f, -1.77f, -1.97f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dialerSip = build;
        build.getClass();
        return build;
    }
}
