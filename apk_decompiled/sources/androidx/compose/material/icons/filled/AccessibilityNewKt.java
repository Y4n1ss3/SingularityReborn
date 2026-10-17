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
import defpackage.bv;
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccessibilityNewKt {
    private static ImageVector _accessibilityNew;

    public static final ImageVector getAccessibilityNew(Icons.Filled filled) {
        ImageVector imageVector = _accessibilityNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AccessibilityNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.5f, 6.0f);
        b.curveToRelative(-2.61f, 0.7f, -5.67f, 1.0f, -8.5f, 1.0f);
        b.reflectiveCurveToRelative(-5.89f, -0.3f, -8.5f, -1.0f);
        b.lineTo(3.0f, 8.0f);
        b.curveToRelative(1.86f, 0.5f, 4.0f, 0.83f, 6.0f, 1.0f);
        r6.D(b, 13.0f, 2.0f, -6.0f, 2.0f);
        bv.x(b, 6.0f, 2.0f, 9.0f);
        b.curveToRelative(2.0f, -0.17f, 4.14f, -0.5f, 6.0f, -1.0f);
        fc.B(b, -0.5f, -2.0f, 12.0f, 6.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.9f, 2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessibilityNew = build;
        build.getClass();
        return build;
    }
}
