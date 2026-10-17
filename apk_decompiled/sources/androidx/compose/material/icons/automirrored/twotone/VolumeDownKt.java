package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.c21;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeDownKt {
    private static ImageVector _volumeDown;

    public static final ImageVector getVolumeDown(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _volumeDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.VolumeDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(kf0.p(7.0f, 13.0f, 2.83f, 12.0f, 15.17f), 8.83f, 9.83f, 11.0f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(16.0f, 7.97f, 8.05f);
        h.curveToRelative(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        h.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        uo.C(h, 5.0f, 9.0f, 6.0f, 4.0f);
        h.lineToRelative(5.0f, 5.0f);
        h.lineTo(14.0f, 4.0f);
        r6.C(h, 9.0f, 9.0f, 5.0f, 9.0f);
        h.moveTo(12.0f, 8.83f);
        h.verticalLineToRelative(6.34f);
        h.lineTo(9.83f, 13.0f);
        af0.m(h, 7.0f, 13.0f, -2.0f, 2.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(h, 12.0f, 8.83f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeDown = build;
        build.getClass();
        return build;
    }
}
