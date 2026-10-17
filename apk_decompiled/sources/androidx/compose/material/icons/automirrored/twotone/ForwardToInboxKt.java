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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForwardToInboxKt {
    private static ImageVector _forwardToInbox;

    public static final ImageVector getForwardToInbox(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _forwardToInbox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.ForwardToInbox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(13.0f, 18.0f, 4.0f, 8.0f);
        c.lineToRelative(8.0f, 5.0f);
        c.lineToRelative(8.0f, -5.0f);
        c.verticalLineToRelative(5.0f);
        c.lineToRelative(-2.0f, 0.0f);
        c.curveTo(15.24f, 13.0f, 13.0f, 15.24f, 13.0f, 18.0f);
        uo.l(c, 13.0f, 18.0f, 12.0f, 11.0f);
        c.lineTo(4.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(c, 16.0f, 12.0f, 11.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.o(d, 9.0f, -2.0f, 4.0f, 8.0f);
        d.lineToRelative(8.0f, 5.0f);
        r6.A(d, 8.0f, -5.0f, 5.0f, 2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        k4.r(d, 12.0f, 11.0f, 4.0f, 6.0f);
        gy.n(d, 16.0f, 12.0f, 11.0f);
        d.moveTo(19.0f, 15.0f);
        d.lineToRelative(4.0f, 4.0f);
        r6.A(d, -4.0f, 4.0f, -3.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(d, -2.0f, 4.0f, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forwardToInbox = build;
        build.getClass();
        return build;
    }
}
