package androidx.compose.material.icons.twotone;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArchiveKt {
    private static ImageVector _archive;

    public static final ImageVector getArchive(Icons.TwoTone twoTone) {
        ImageVector imageVector = _archive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Archive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(5.0f, 19.0f, 14.0f, 19.0f, 8.0f);
        bv.r(p, 5.0f, 8.0f, 11.0f);
        bv.y(p, 10.55f, 13.0f, -3.0f, 2.91f);
        p.verticalLineToRelative(3.0f);
        p.lineTo(16.0f, 13.0f);
        p.lineToRelative(-4.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(p, -4.0f, -4.0f, 2.55f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(16.0f, 13.0f, -2.55f, -3.0f, -2.9f);
        n.verticalLineToRelative(3.0f);
        bv.o(n, 8.0f, 13.0f, 4.0f, 4.0f);
        n.moveTo(20.54f, 5.23f);
        n.lineToRelative(-1.39f, -1.68f);
        n.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        n.lineTo(6.0f, 3.0f);
        n.curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.16f, 0.55f);
        n.lineTo(3.46f, 5.23f);
        n.curveTo(3.17f, 5.57f, 3.0f, 6.02f, 3.0f, 6.5f);
        n.lineTo(3.0f, 19.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(14.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.lineTo(21.0f, 6.5f);
        n.curveToRelative(0.0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f);
        af0.l(n, 6.24f, 5.0f, 11.52f);
        n.lineToRelative(0.81f, 0.97f);
        bv.o(n, 5.44f, 5.97f, 0.8f, -0.97f);
        n.moveTo(19.0f, 19.0f);
        n.lineTo(5.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 5.0f, 8.0f, 14.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _archive = build;
        build.getClass();
        return build;
    }
}
