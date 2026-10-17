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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerifiedKt {
    private static ImageVector _verified;

    public static final ImageVector getVerified(Icons.Filled filled) {
        ImageVector imageVector = _verified;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Verified", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(23.0f, 12.0f, -2.44f, -2.79f);
        e.lineToRelative(0.34f, -3.69f);
        e.lineToRelative(-3.61f, -0.82f);
        e.lineTo(15.4f, 1.5f);
        e.lineTo(12.0f, 2.96f);
        e.lineTo(8.6f, 1.5f);
        e.lineTo(6.71f, 4.69f);
        e.lineTo(3.1f, 5.5f);
        e.lineTo(3.44f, 9.2f);
        e.lineTo(1.0f, 12.0f);
        e.lineToRelative(2.44f, 2.79f);
        e.lineToRelative(-0.34f, 3.7f);
        e.lineToRelative(3.61f, 0.82f);
        e.lineTo(8.6f, 22.5f);
        e.lineToRelative(3.4f, -1.47f);
        e.lineToRelative(3.4f, 1.46f);
        e.lineToRelative(1.89f, -3.19f);
        e.lineToRelative(3.61f, -0.82f);
        gy.B(e, -0.34f, -3.69f, 23.0f, 12.0f);
        e.moveTo(10.09f, 16.72f);
        e.lineToRelative(-3.8f, -3.81f);
        e.lineToRelative(1.48f, -1.48f);
        e.lineToRelative(2.32f, 2.33f);
        e.lineToRelative(5.85f, -5.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.48f, 1.48f, 10.09f, 16.72f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verified = build;
        build.getClass();
        return build;
    }
}
