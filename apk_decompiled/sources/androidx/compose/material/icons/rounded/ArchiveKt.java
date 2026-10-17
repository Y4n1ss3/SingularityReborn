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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArchiveKt {
    private static ImageVector _archive;

    public static final ImageVector getArchive(Icons.Rounded rounded) {
        ImageVector imageVector = _archive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Archive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.54f, 5.23f, -1.39f, -1.68f);
        e.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        e.lineTo(6.0f, 3.0f);
        e.curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.16f, 0.55f);
        e.lineTo(3.46f, 5.23f);
        e.curveTo(3.17f, 5.57f, 3.0f, 6.02f, 3.0f, 6.5f);
        e.lineTo(3.0f, 19.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(14.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.lineTo(21.0f, 6.5f);
        e.curveToRelative(0.0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f);
        k4.r(e, 11.65f, 17.15f, 6.5f, 12.0f);
        af0.m(e, 10.0f, 12.0f, -2.0f, 4.0f);
        gy.C(e, 2.0f, 3.5f, -5.15f, 5.15f);
        e.curveToRelative(-0.19f, 0.19f, -0.51f, 0.19f, -0.7f, 0.0f);
        k4.x(e, 5.12f, 5.0f, 0.81f, -1.0f);
        e.horizontalLineToRelative(12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 0.94f, 1.0f, 5.12f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _archive = build;
        build.getClass();
        return build;
    }
}
