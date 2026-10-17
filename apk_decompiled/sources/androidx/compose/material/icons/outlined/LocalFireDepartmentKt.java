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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalFireDepartmentKt {
    private static ImageVector _localFireDepartment;

    public static final ImageVector getLocalFireDepartment(Icons.Outlined outlined) {
        ImageVector imageVector = _localFireDepartment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalFireDepartment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.0f, 6.0f, -0.44f, 0.55f);
        e.curveToRelative(-0.42f, 0.52f, -0.98f, 0.75f, -1.54f, 0.75f);
        e.curveTo(13.0f, 7.3f, 12.0f, 6.52f, 12.0f, 5.3f);
        e.verticalLineTo(2.0f);
        e.curveToRelative(0.0f, 0.0f, -8.0f, 4.0f, -8.0f, 11.0f);
        e.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        e.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        e.curveTo(20.0f, 10.04f, 18.39f, 7.38f, 16.0f, 6.0f);
        e.close();
        e.moveTo(12.0f, 19.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.87f, -2.0f, -1.94f);
        e.curveToRelative(0.0f, -0.51f, 0.2f, -0.99f, 0.58f, -1.36f);
        e.lineToRelative(1.42f, -1.4f);
        e.lineToRelative(1.43f, 1.4f);
        e.curveTo(13.8f, 16.07f, 14.0f, 16.55f, 14.0f, 17.06f);
        e.curveTo(14.0f, 18.13f, 13.1f, 19.0f, 12.0f, 19.0f);
        k4.r(e, 15.96f, 17.5f, 15.96f, 17.5f);
        e.curveToRelative(0.04f, -0.36f, 0.22f, -1.89f, -1.13f, -3.22f);
        e.lineToRelative(0.0f, 0.0f);
        e.lineTo(12.0f, 11.5f);
        e.lineToRelative(-2.83f, 2.78f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(-1.36f, 1.34f, -1.17f, 2.88f, -1.13f, 3.22f);
        e.curveTo(6.79f, 16.4f, 6.0f, 14.79f, 6.0f, 13.0f);
        e.curveToRelative(0.0f, -3.16f, 2.13f, -5.65f, 4.03f, -7.25f);
        e.curveToRelative(0.23f, 1.99f, 1.93f, 3.55f, 3.99f, 3.55f);
        e.curveToRelative(0.78f, 0.0f, 1.54f, -0.23f, 2.18f, -0.66f);
        e.curveTo(17.34f, 9.78f, 18.0f, 11.35f, 18.0f, 13.0f);
        e.curveTo(18.0f, 14.79f, 17.21f, 16.4f, 15.96f, 17.5f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFireDepartment = build;
        build.getClass();
        return build;
    }
}
