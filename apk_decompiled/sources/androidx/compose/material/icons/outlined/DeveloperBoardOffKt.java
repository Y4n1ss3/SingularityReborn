package androidx.compose.material.icons.outlined;

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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeveloperBoardOffKt {
    private static ImageVector _developerBoardOff;

    public static final ImageVector getDeveloperBoardOff(Icons.Outlined outlined) {
        ImageVector imageVector = _developerBoardOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DeveloperBoardOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(7.83f, 5.0f, 18.0f, 10.17f);
        r6.w(q, 19.83f, 17.0f, 22.0f, -2.0f);
        af0.v(q, -2.0f, -2.0f, 2.0f, -2.0f);
        af0.n(q, -2.0f, 9.0f, 2.0f, 7.0f);
        q.horizontalLineToRelative(-2.0f);
        q.verticalLineTo(5.0f);
        q.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.m(q, 5.83f, 7.83f, 5.0f);
        kp0.t(q, 12.0f, 9.17f, 7.0f, 4.0f);
        uo.D(q, 3.0f, -3.17f, 12.0f, 9.17f);
        k4.A(q, 9.83f, 7.0f, 11.0f, 1.17f);
        uo.l(q, 9.83f, 7.0f, 13.83f, 11.0f);
        q.horizontalLineTo(16.0f);
        q.verticalLineToRelative(2.17f);
        q.lineTo(13.83f, 11.0f);
        q.close();
        q.moveTo(18.0f, 21.0f);
        q.curveToRelative(0.06f, 0.0f, 0.11f, 0.0f, 0.16f, -0.01f);
        q.lineToRelative(2.32f, 2.32f);
        q.lineToRelative(1.41f, -1.41f);
        q.lineTo(2.1f, 2.1f);
        q.lineTo(0.69f, 3.51f);
        q.lineToRelative(1.32f, 1.32f);
        q.curveTo(2.0f, 4.89f, 2.0f, 4.94f, 2.0f, 5.0f);
        q.verticalLineToRelative(14.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.x(q, 18.0f, 4.0f, 19.0f, 6.83f);
        fc.u(q, 2.0f, 2.0f, 12.0f, 3.17f);
        j50.x(q, 1.0f, 1.0f, 6.0f, 4.0f);
        bv.p(q, 5.0f, -3.17f, 1.0f, 1.0f);
        uo.u(q, 17.0f, 2.17f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(q, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerBoardOff = build;
        build.getClass();
        return build;
    }
}
