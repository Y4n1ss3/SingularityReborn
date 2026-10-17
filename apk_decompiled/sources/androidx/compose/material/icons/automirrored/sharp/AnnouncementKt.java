package androidx.compose.material.icons.automirrored.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnnouncementKt {
    private static ImageVector _announcement;

    public static final ImageVector getAnnouncement(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _announcement;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.Announcement", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(22.0f, 2.0f, 2.0f, 2.0f, 20.0f);
        s.lineToRelative(4.0f, -4.0f);
        gy.n(s, 16.0f, 22.0f, 2.0f);
        s.moveTo(13.0f, 11.0f);
        uo.n(s, -2.0f, 11.0f, 5.0f, 2.0f);
        bv.m(s, 6.0f, 13.0f, 15.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(s, -2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _announcement = build;
        build.getClass();
        return build;
    }
}
