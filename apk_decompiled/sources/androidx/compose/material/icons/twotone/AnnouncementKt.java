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
import defpackage.er;
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnnouncementKt {
    private static ImageVector _announcement;

    public static final ImageVector getAnnouncement(Icons.TwoTone twoTone) {
        ImageVector imageVector = _announcement;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Announcement", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(4.0f, 4.0f, 13.17f, 0.59f, -0.59f);
        n.lineToRelative(0.58f, -0.58f);
        n.lineTo(20.0f, 16.0f);
        r6.C(n, 20.0f, 4.0f, 4.0f, 4.0f);
        k4.C(n, 13.0f, 15.0f, -2.0f, -2.0f);
        fc.x(n, 2.0f, 2.0f, 13.0f, 11.0f);
        uo.n(n, -2.0f, 11.0f, 5.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(n, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 2.0f, 4.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        r6.h(i, 18.0f, 4.0f, -4.0f, 14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 20.0f, 16.0f, 5.17f, 16.0f);
        i.lineToRelative(-0.59f, 0.59f);
        i.lineToRelative(-0.58f, 0.58f);
        r6.m(i, 4.0f, 4.0f, 16.0f, 12.0f);
        k4.C(i, 11.0f, 5.0f, 2.0f, 6.0f);
        kp0.A(i, -2.0f, 11.0f, 13.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(i, 2.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _announcement = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getAnnouncement$annotations(Icons.TwoTone twoTone) {
    }
}
