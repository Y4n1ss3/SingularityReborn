package androidx.compose.material.icons.sharp;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MailLockKt {
    private static ImageVector _mailLock;

    public static final ImageVector getMailLock(Icons.Sharp sharp) {
        ImageVector imageVector = _mailLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MailLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 9.97f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(2.01f);
        fc.w(pathBuilder, 2.0f, 20.0f, 14.0f, -5.03f);
        pathBuilder.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        k4.w(pathBuilder, 22.0f, 20.0f, 8.0f);
        pathBuilder.lineToRelative(-8.0f, 5.0f);
        pathBuilder.lineTo(4.0f, 8.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.lineToRelative(8.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(pathBuilder, 8.0f, -5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(23.0f, 15.0f, -0.89f);
        h.curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f);
        h.curveTo(20.08f, 11.82f, 19.0f, 12.79f, 19.0f, 14.0f);
        r6.D(h, 1.0f, -1.0f, 5.0f, 6.0f);
        kf0.n(h, -5.0f, 23.0f, 22.0f, 15.0f);
        h.horizontalLineToRelative(-2.0f);
        h.verticalLineToRelative(-1.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(h, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mailLock = build;
        build.getClass();
        return build;
    }
}
