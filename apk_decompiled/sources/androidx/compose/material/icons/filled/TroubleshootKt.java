package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TroubleshootKt {
    private static ImageVector _troubleshoot;

    public static final ImageVector getTroubleshoot(Icons.Filled filled) {
        ImageVector imageVector = _troubleshoot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Troubleshoot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 20.59f, -4.69f, -4.69f);
        e.curveTo(18.37f, 14.55f, 19.0f, 12.85f, 19.0f, 11.0f);
        e.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        e.curveToRelative(-4.08f, 0.0f, -7.44f, 3.05f, -7.93f, 7.0f);
        e.horizontalLineToRelative(2.02f);
        e.curveTo(5.57f, 7.17f, 8.03f, 5.0f, 11.0f, 5.0f);
        e.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        e.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        e.curveToRelative(-2.42f, 0.0f, -4.5f, -1.44f, -5.45f, -3.5f);
        e.horizontalLineTo(3.4f);
        e.curveTo(4.45f, 16.69f, 7.46f, 19.0f, 11.0f, 19.0f);
        e.curveToRelative(1.85f, 0.0f, 3.55f, -0.63f, 4.9f, -1.69f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 20.59f, 22.0f, 22.0f, 20.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(8.43f, 9.69f, 1.22f, 5.31f);
        e2.lineToRelative(1.64f, 0.0f);
        e2.lineToRelative(1.26f, -3.78f);
        e2.lineToRelative(0.95f, 2.28f);
        e2.lineToRelative(2.0f, 0.0f);
        e2.lineToRelative(0.0f, -1.5f);
        e2.lineToRelative(-1.0f, 0.0f);
        e2.lineToRelative(-1.25f, -3.0f);
        e2.lineToRelative(-1.54f, 0.0f);
        e2.lineToRelative(-1.12f, 3.37f);
        e2.lineToRelative(-1.24f, -5.37f);
        e2.lineToRelative(-1.65f, 0.0f);
        e2.lineToRelative(-1.25f, 4.0f);
        e2.lineToRelative(-5.45f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 0.0f, 1.5f, 6.55f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _troubleshoot = build;
        build.getClass();
        return build;
    }
}
