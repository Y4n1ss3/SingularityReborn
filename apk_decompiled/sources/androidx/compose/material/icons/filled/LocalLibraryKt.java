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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.Filled filled) {
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocalLibrary", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 11.55f);
        b.curveTo(9.64f, 9.35f, 6.48f, 8.0f, 3.0f, 8.0f);
        b.verticalLineToRelative(11.0f);
        b.curveToRelative(3.48f, 0.0f, 6.64f, 1.35f, 9.0f, 3.55f);
        b.curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9.0f, -3.55f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(-3.48f, 0.0f, -6.64f, 1.35f, -9.0f, 3.55f);
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
