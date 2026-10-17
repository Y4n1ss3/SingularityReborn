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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.Rounded rounded) {
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalLibrary", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 11.55f);
        b.curveToRelative(-1.82f, -1.7f, -4.12f, -2.89f, -6.68f, -3.35f);
        b.curveTo(4.11f, 7.99f, 3.0f, 8.95f, 3.0f, 10.18f);
        b.verticalLineToRelative(6.24f);
        b.curveToRelative(0.0f, 1.68f, 0.72f, 2.56f, 1.71f, 2.69f);
        b.curveToRelative(2.5f, 0.32f, 4.77f, 1.35f, 6.63f, 2.87f);
        b.curveToRelative(0.35f, 0.29f, 0.92f, 0.32f, 1.27f, 0.04f);
        b.curveToRelative(1.87f, -1.53f, 4.16f, -2.58f, 6.68f, -2.9f);
        b.curveToRelative(0.94f, -0.13f, 1.71f, -1.06f, 1.71f, -2.02f);
        b.verticalLineToRelative(-6.92f);
        b.curveToRelative(0.0f, -1.23f, -1.11f, -2.19f, -2.32f, -1.98f);
        b.curveToRelative(-2.56f, 0.46f, -4.86f, 1.65f, -6.68f, 3.35f);
        b.close();
        b.moveTo(12.0f, 8.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 1.34f, 3.0f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLibrary = build;
        build.getClass();
        return build;
    }
}
