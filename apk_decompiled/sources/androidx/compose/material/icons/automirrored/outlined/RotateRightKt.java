package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RotateRightKt {
    private static ImageVector _rotateRight;

    public static final ImageVector getRotateRight(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _rotateRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.RotateRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(15.55f, 5.55f, 11.0f, 1.0f, 3.07f);
        s.curveTo(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        s.reflectiveCurveToRelative(3.05f, 7.44f, 7.0f, 7.93f);
        s.verticalLineToRelative(-2.02f);
        s.curveToRelative(-2.84f, -0.48f, -5.0f, -2.94f, -5.0f, -5.91f);
        s.reflectiveCurveToRelative(2.16f, -5.43f, 5.0f, -5.91f);
        bv.o(s, 11.0f, 10.0f, 4.55f, -4.45f);
        s.moveTo(19.93f, 11.0f);
        s.curveToRelative(-0.17f, -1.39f, -0.72f, -2.73f, -1.62f, -3.89f);
        s.lineToRelative(-1.42f, 1.42f);
        s.curveToRelative(0.54f, 0.75f, 0.88f, 1.6f, 1.02f, 2.47f);
        s.horizontalLineToRelative(2.02f);
        s.close();
        s.moveTo(13.0f, 17.9f);
        s.verticalLineToRelative(2.02f);
        s.curveToRelative(1.39f, -0.17f, 2.74f, -0.71f, 3.9f, -1.61f);
        s.lineToRelative(-1.44f, -1.44f);
        s.curveToRelative(-0.75f, 0.54f, -1.59f, 0.89f, -2.46f, 1.03f);
        k4.x(s, 16.89f, 15.48f, 1.42f, 1.41f);
        s.curveToRelative(0.9f, -1.16f, 1.45f, -2.5f, 1.62f, -3.89f);
        s.horizontalLineToRelative(-2.02f);
        s.curveToRelative(-0.14f, 0.87f, -0.48f, 1.72f, -1.02f, 2.48f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateRight = build;
        build.getClass();
        return build;
    }
}
