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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestoreKt {
    private static ImageVector _restore;

    public static final ImageVector getRestore(Icons.Filled filled) {
        ImageVector imageVector = _restore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Restore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 3.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.lineTo(1.0f, 12.0f);
        b.lineToRelative(3.89f, 3.89f);
        b.lineToRelative(0.07f, 0.14f);
        b.lineTo(9.0f, 12.0f);
        b.lineTo(6.0f, 12.0f);
        b.curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        b.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        b.curveToRelative(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        b.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        b.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        bv.v(b, 12.0f, 8.0f, 5.0f);
        b.lineToRelative(4.28f, 2.54f);
        b.lineToRelative(0.72f, -1.21f);
        b.lineToRelative(-3.5f, -2.08f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 13.5f, 8.0f, 12.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restore = build;
        build.getClass();
        return build;
    }
}
