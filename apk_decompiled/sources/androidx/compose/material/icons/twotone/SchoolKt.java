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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SchoolKt {
    private static ImageVector _school;

    public static final ImageVector getSchool(Icons.TwoTone twoTone) {
        ImageVector imageVector = _school;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.School", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(7.0f, 12.27f, 3.72f, 5.0f, 2.73f);
        n.lineToRelative(5.0f, -2.73f);
        kf0.t(n, -3.72f, 12.0f, 15.0f);
        n.moveTo(5.18f, 9.0f);
        n.lineTo(12.0f, 12.72f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(n, 18.82f, 9.0f, 12.0f, 5.28f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 3.0f, 1.0f, 9.0f);
        i.lineToRelative(4.0f, 2.18f);
        i.verticalLineToRelative(6.0f);
        i.lineTo(12.0f, 21.0f);
        i.lineToRelative(7.0f, -3.82f);
        i.verticalLineToRelative(-6.0f);
        i.lineToRelative(2.0f, -1.09f);
        i.lineTo(21.0f, 17.0f);
        i.horizontalLineToRelative(2.0f);
        r6.C(i, 23.0f, 9.0f, 12.0f, 3.0f);
        i.moveTo(17.0f, 15.99f);
        i.lineToRelative(-5.0f, 2.73f);
        i.lineToRelative(-5.0f, -2.73f);
        i.verticalLineToRelative(-3.72f);
        i.lineTo(12.0f, 15.0f);
        uf.v(i, 5.0f, -2.73f, 3.72f);
        i.moveTo(12.0f, 12.72f);
        i.lineTo(5.18f, 9.0f);
        i.lineTo(12.0f, 5.28f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 18.82f, 9.0f, 12.0f, 12.72f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _school = build;
        build.getClass();
        return build;
    }
}
