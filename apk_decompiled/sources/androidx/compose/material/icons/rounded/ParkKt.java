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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ParkKt {
    private static ImageVector _park;

    public static final ImageVector getPark(Icons.Rounded rounded) {
        ImageVector imageVector = _park;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Park", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(16.96f, 12.0f, 0.08f);
        a.curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f);
        a.lineToRelative(-5.08f, -7.25f);
        a.curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f);
        a.lineTo(6.1f, 10.43f);
        a.curveTo(5.64f, 11.09f, 6.12f, 12.0f, 6.93f, 12.0f);
        a.horizontalLineToRelative(0.04f);
        a.lineToRelative(-2.9f, 4.46f);
        a.curveTo(3.63f, 17.12f, 4.11f, 18.0f, 4.91f, 18.0f);
        a.horizontalLineToRelative(5.08f);
        a.verticalLineToRelative(2.02f);
        a.curveToRelative(0.0f, 1.09f, 0.89f, 1.98f, 1.98f, 1.98f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(1.09f, 0.0f, 1.98f, -0.89f, 1.98f, -1.98f);
        a.verticalLineTo(18.0f);
        a.horizontalLineToRelative(5.15f);
        a.curveToRelative(0.8f, 0.0f, 1.28f, -0.89f, 0.83f, -1.55f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 16.96f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _park = build;
        build.getClass();
        return build;
    }
}
