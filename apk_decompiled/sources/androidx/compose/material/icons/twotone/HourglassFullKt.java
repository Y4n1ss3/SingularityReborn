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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassFullKt {
    private static ImageVector _hourglassFull;

    public static final ImageVector getHourglassFull(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hourglassFull;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HourglassFull", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.0f, 7.5f, 4.0f, 4.0f);
        e.lineToRelative(4.0f, -4.0f);
        r6.C(e, 16.0f, 4.0f, 8.0f, 4.0f);
        e.moveTo(8.0f, 16.5f);
        fc.w(e, 8.0f, 20.0f, 8.0f, -3.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(e, -4.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(18.0f, 2.0f, 6.0f, 2.0f, 6.0f);
        s.horizontalLineToRelative(0.01f);
        s.lineTo(6.0f, 8.01f);
        s.lineTo(10.0f, 12.0f);
        s.lineToRelative(-4.0f, 4.0f);
        s.lineToRelative(0.01f, 0.01f);
        s.lineTo(6.0f, 16.01f);
        fc.w(s, 6.0f, 22.0f, 12.0f, -5.99f);
        s.horizontalLineToRelative(-0.01f);
        s.lineTo(18.0f, 16.0f);
        s.lineToRelative(-4.0f, -4.0f);
        s.lineToRelative(4.0f, -3.99f);
        s.lineToRelative(-0.01f, -0.01f);
        r6.C(s, 18.0f, 8.0f, 18.0f, 2.0f);
        s.moveTo(16.0f, 16.5f);
        s.lineTo(16.0f, 20.0f);
        s.lineTo(8.0f, 20.0f);
        s.verticalLineToRelative(-3.5f);
        fc.C(s, 4.0f, -4.0f, 4.0f, 4.0f);
        s.moveTo(16.0f, 7.5f);
        s.lineToRelative(-4.0f, 4.0f);
        s.lineToRelative(-4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(s, 8.0f, 4.0f, 8.0f, 3.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassFull = build;
        build.getClass();
        return build;
    }
}
