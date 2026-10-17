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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.TwoTone twoTone) {
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Dangerous", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(9.1f, 5.0f, 5.0f, 9.1f, 5.8f);
        s.lineTo(9.1f, 19.0f);
        kp0.q(s, 5.8f, 4.1f, -4.1f, 9.1f);
        kf0.h(s, 14.9f, 5.0f, 9.1f);
        s.moveTo(16.24f, 14.83f);
        s.lineToRelative(-1.41f, 1.41f);
        s.lineTo(12.0f, 13.41f);
        s.lineToRelative(-2.83f, 2.83f);
        s.lineToRelative(-1.41f, -1.41f);
        s.lineTo(10.59f, 12.0f);
        s.lineTo(7.76f, 9.17f);
        s.lineToRelative(1.41f, -1.41f);
        s.lineTo(12.0f, 10.59f);
        s.lineToRelative(2.83f, -2.83f);
        s.lineToRelative(1.41f, 1.41f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(s, 13.41f, 12.0f, 16.24f, 14.83f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(15.73f, 3.0f, 8.27f, 3.0f, 8.27f);
        uo.k(l, 7.46f, 8.27f, 21.0f, 7.46f);
        l.lineTo(21.0f, 15.73f);
        bv.k(l, 8.27f, 15.73f, 3.0f);
        l.moveTo(19.0f, 14.9f);
        l.lineTo(14.9f, 19.0f);
        l.horizontalLineTo(9.1f);
        l.lineTo(5.0f, 14.9f);
        l.verticalLineTo(9.1f);
        l.lineTo(9.1f, 5.0f);
        l.horizontalLineToRelative(5.8f);
        l.lineTo(19.0f, 9.1f);
        l.verticalLineTo(14.9f);
        l.close();
        l.moveTo(14.83f, 7.76f);
        l.lineTo(12.0f, 10.59f);
        l.lineTo(9.17f, 7.76f);
        l.lineTo(7.76f, 9.17f);
        l.lineTo(10.59f, 12.0f);
        l.lineToRelative(-2.83f, 2.83f);
        l.lineToRelative(1.41f, 1.41f);
        l.lineTo(12.0f, 13.41f);
        l.lineToRelative(2.83f, 2.83f);
        l.lineToRelative(1.41f, -1.41f);
        l.lineTo(13.41f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(l, 2.83f, -2.83f, 14.83f, 7.76f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = build;
        build.getClass();
        return build;
    }
}
