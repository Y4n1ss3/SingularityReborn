package androidx.compose.material.icons.automirrored.rounded;

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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistantDirectionKt {
    private static ImageVector _assistantDirection;

    public static final ImageVector getAssistantDirection(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _assistantDirection;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.AssistantDirection", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(13.5f, 10.0f, 9.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(3.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(d, -2.0f, 3.5f, 1.29f);
        d.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        d.lineToRelative(2.29f, -2.29f);
        d.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        d.lineToRelative(-2.29f, -2.29f);
        d.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f);
        bv.t(d, 10.0f, 12.0f, 1.0f);
        d.curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f);
        d.reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f);
        d.reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f);
        d.reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f);
        k4.x(d, 19.73f, 12.58f, -7.19f, 7.22f);
        d.curveToRelative(-0.35f, 0.27f, -0.79f, 0.27f, -1.15f, 0.0f);
        d.lineTo(4.2f, 12.58f);
        d.curveToRelative(-0.27f, -0.36f, -0.27f, -0.8f, 0.0f, -1.16f);
        d.lineToRelative(7.19f, -7.22f);
        d.curveToRelative(0.35f, -0.27f, 0.79f, -0.27f, 1.15f, 0.0f);
        d.lineToRelative(7.19f, 7.22f);
        d.curveTo(20.09f, 11.69f, 20.09f, 12.22f, 19.73f, 12.58f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistantDirection = build;
        build.getClass();
        return build;
    }
}
