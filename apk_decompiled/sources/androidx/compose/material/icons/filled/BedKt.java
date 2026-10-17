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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BedKt {
    private static ImageVector _bed;

    public static final ImageVector getBed(Icons.Filled filled) {
        ImageVector imageVector = _bed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Bed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(21.0f, 10.78f, 8.0f);
        d.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        d.horizontalLineToRelative(-4.0f);
        d.curveToRelative(-0.77f, 0.0f, -1.47f, 0.3f, -2.0f, 0.78f);
        d.curveTo(11.47f, 5.3f, 10.77f, 5.0f, 10.0f, 5.0f);
        d.horizontalLineTo(6.0f);
        d.curveTo(4.35f, 5.0f, 3.0f, 6.35f, 3.0f, 8.0f);
        d.verticalLineToRelative(2.78f);
        d.curveTo(2.39f, 11.33f, 2.0f, 12.12f, 2.0f, 13.0f);
        r6.D(d, 6.0f, 2.0f, -2.0f, 16.0f);
        kf0.z(d, 2.0f, 2.0f, -6.0f);
        d.curveTo(22.0f, 12.12f, 21.61f, 11.33f, 21.0f, 10.78f);
        af0.l(d, 14.0f, 7.0f, 4.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.x(d, 2.0f, -6.0f, 8.0f);
        d.curveTo(13.0f, 7.45f, 13.45f, 7.0f, 14.0f, 7.0f);
        d.close();
        d.moveTo(5.0f, 8.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(4.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.q(d, 2.0f, 5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bed = build;
        build.getClass();
        return build;
    }
}
