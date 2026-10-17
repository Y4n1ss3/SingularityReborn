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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicNoneKt {
    private static ImageVector _micNone;

    public static final ImageVector getMicNone(Icons.Rounded rounded) {
        ImageVector imageVector = _micNone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MicNone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 14.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b.lineTo(15.0f, 5.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        b.reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(11.0f, 5.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        uo.l(b, 11.0f, 5.0f, 17.91f, 11.0f);
        b.curveToRelative(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f);
        b.curveTo(16.52f, 14.2f, 14.47f, 16.0f, 12.0f, 16.0f);
        b.reflectiveCurveToRelative(-4.52f, -1.8f, -4.93f, -4.15f);
        b.curveToRelative(-0.08f, -0.49f, -0.49f, -0.85f, -0.98f, -0.85f);
        b.curveToRelative(-0.61f, 0.0f, -1.09f, 0.54f, -1.0f, 1.14f);
        b.curveToRelative(0.49f, 3.0f, 2.89f, 5.35f, 5.91f, 5.78f);
        b.lineTo(11.0f, 20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.08f);
        b.curveToRelative(3.02f, -0.43f, 5.42f, -2.78f, 5.91f, -5.78f);
        b.curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micNone = build;
        build.getClass();
        return build;
    }
}
