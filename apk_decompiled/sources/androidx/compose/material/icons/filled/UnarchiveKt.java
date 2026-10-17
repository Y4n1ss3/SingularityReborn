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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnarchiveKt {
    private static ImageVector _unarchive;

    public static final ImageVector getUnarchive(Icons.Filled filled) {
        ImageVector imageVector = _unarchive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Unarchive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.55f, 5.22f, -1.39f, -1.68f);
        e.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        e.horizontalLineTo(6.0f);
        e.curveTo(5.53f, 3.0f, 5.12f, 3.21f, 4.85f, 3.55f);
        e.lineTo(3.46f, 5.22f);
        e.curveTo(3.17f, 5.57f, 3.0f, 6.01f, 3.0f, 6.5f);
        e.verticalLineTo(19.0f);
        e.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(14.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(6.5f);
        e.curveTo(21.0f, 6.01f, 20.83f, 5.57f, 20.55f, 5.22f);
        k4.x(e, 12.0f, 9.5f, 5.5f, 5.5f);
        uf.k(e, 14.0f, 2.0f, -4.0f, -2.0f);
        kf0.m(e, 6.5f, 12.0f, 9.5f);
        e.moveTo(5.12f, 5.0f);
        e.lineToRelative(0.82f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(e, 12.0f, 0.93f, 1.0f, 5.12f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unarchive = build;
        build.getClass();
        return build;
    }
}
