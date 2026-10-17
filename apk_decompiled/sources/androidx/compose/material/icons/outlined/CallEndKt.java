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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CallEndKt {
    private static ImageVector _callEnd;

    public static final ImageVector getCallEnd(Icons.Outlined outlined) {
        ImageVector imageVector = _callEnd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CallEnd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.59f, 10.52f);
        b.curveToRelative(1.05f, 0.51f, 2.04f, 1.15f, 2.96f, 1.91f);
        b.lineToRelative(-1.07f, 1.07f);
        b.curveToRelative(-0.58f, -0.47f, -1.21f, -0.89f, -1.88f, -1.27f);
        b.verticalLineToRelative(-1.71f);
        b.moveToRelative(-13.2f, 0.0f);
        b.verticalLineToRelative(1.7f);
        b.curveToRelative(-0.65f, 0.37f, -1.28f, 0.79f, -1.87f, 1.27f);
        b.lineToRelative(-1.07f, -1.07f);
        b.curveToRelative(0.91f, -0.75f, 1.9f, -1.38f, 2.94f, -1.9f);
        b.moveTo(12.0f, 7.0f);
        b.curveTo(7.46f, 7.0f, 3.34f, 8.78f, 0.29f, 11.67f);
        b.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        b.reflectiveCurveToRelative(0.11f, 0.53f, 0.29f, 0.7f);
        b.lineToRelative(2.48f, 2.48f);
        b.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        b.curveToRelative(0.27f, 0.0f, 0.52f, -0.1f, 0.7f, -0.28f);
        b.curveToRelative(0.79f, -0.73f, 1.68f, -1.36f, 2.66f, -1.85f);
        b.curveToRelative(0.33f, -0.16f, 0.56f, -0.51f, 0.56f, -0.9f);
        b.verticalLineToRelative(-3.1f);
        b.curveTo(8.85f, 9.25f, 10.4f, 9.0f, 12.0f, 9.0f);
        b.reflectiveCurveToRelative(3.15f, 0.25f, 4.59f, 0.73f);
        b.verticalLineToRelative(3.1f);
        b.curveToRelative(0.0f, 0.4f, 0.23f, 0.74f, 0.56f, 0.9f);
        b.curveToRelative(0.98f, 0.49f, 1.88f, 1.11f, 2.67f, 1.85f);
        b.curveToRelative(0.18f, 0.17f, 0.43f, 0.28f, 0.7f, 0.28f);
        b.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        b.lineToRelative(2.48f, -2.48f);
        b.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        b.reflectiveCurveToRelative(-0.11f, -0.53f, -0.29f, -0.71f);
        b.curveTo(20.66f, 8.78f, 16.54f, 7.0f, 12.0f, 7.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callEnd = build;
        build.getClass();
        return build;
    }
}
