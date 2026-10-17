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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.Outlined outlined) {
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalLibrary", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 9.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.close();
        b.moveTo(12.0f, 3.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.close();
        b.moveTo(12.0f, 11.55f);
        b.curveTo(9.64f, 9.35f, 6.48f, 8.0f, 3.0f, 8.0f);
        b.verticalLineToRelative(11.0f);
        b.curveToRelative(3.48f, 0.0f, 6.64f, 1.35f, 9.0f, 3.55f);
        b.curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9.0f, -3.55f);
        b.lineTo(21.0f, 8.0f);
        b.curveToRelative(-3.48f, 0.0f, -6.64f, 1.35f, -9.0f, 3.55f);
        b.close();
        b.moveTo(19.0f, 17.13f);
        b.curveToRelative(-2.53f, 0.34f, -4.93f, 1.3f, -7.0f, 2.82f);
        b.curveToRelative(-2.06f, -1.52f, -4.47f, -2.49f, -7.0f, -2.83f);
        b.verticalLineToRelative(-6.95f);
        b.curveToRelative(2.1f, 0.38f, 4.05f, 1.35f, 5.64f, 2.83f);
        b.lineTo(12.0f, 14.28f);
        b.lineToRelative(1.36f, -1.27f);
        b.curveToRelative(1.59f, -1.48f, 3.54f, -2.45f, 5.64f, -2.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, 6.95f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLibrary = build;
        build.getClass();
        return build;
    }
}
