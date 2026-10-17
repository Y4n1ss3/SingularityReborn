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
public final class DisabledVisibleKt {
    private static ImageVector _disabledVisible;

    public static final ImageVector getDisabledVisible(Icons.Outlined outlined) {
        ImageVector imageVector = _disabledVisible;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DisabledVisible", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 15.0f);
        b.curveToRelative(1.95f, 0.0f, 3.76f, 0.98f, 4.75f, 2.5f);
        b.curveTo(20.76f, 19.02f, 18.95f, 20.0f, 17.0f, 20.0f);
        b.reflectiveCurveToRelative(-3.76f, -0.98f, -4.75f, -2.5f);
        b.curveTo(13.24f, 15.98f, 15.05f, 15.0f, 17.0f, 15.0f);
        b.close();
        b.moveTo(17.0f, 13.0f);
        b.curveToRelative(-3.18f, 0.0f, -5.9f, 1.87f, -7.0f, 4.5f);
        b.curveToRelative(1.1f, 2.63f, 3.82f, 4.5f, 7.0f, 4.5f);
        b.reflectiveCurveToRelative(5.9f, -1.87f, 7.0f, -4.5f);
        b.curveTo(22.9f, 14.87f, 20.18f, 13.0f, 17.0f, 13.0f);
        b.close();
        b.moveTo(17.0f, 19.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(16.17f, 16.0f, 17.0f, 16.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(17.83f, 19.0f, 17.0f, 19.0f);
        b.close();
        b.moveTo(21.99f, 12.34f);
        b.curveTo(22.0f, 12.23f, 22.0f, 12.11f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.17f, 3.93f, 9.43f, 8.96f, 9.95f);
        b.curveToRelative(-0.93f, -0.73f, -1.72f, -1.64f, -2.32f, -2.68f);
        b.curveTo(5.9f, 18.0f, 4.0f, 15.22f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f);
        b.lineToRelative(5.66f, 5.66f);
        b.curveToRelative(0.56f, -0.4f, 1.17f, -0.73f, 1.82f, -1.0f);
        b.lineTo(7.1f, 5.69f);
        b.curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(4.24f, 0.0f, 7.7f, 3.29f, 7.98f, 7.45f);
        b.curveTo(20.69f, 11.67f, 21.37f, 11.97f, 21.99f, 12.34f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _disabledVisible = build;
        build.getClass();
        return build;
    }
}
