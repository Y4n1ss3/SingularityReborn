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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommentsDisabledKt {
    private static ImageVector _commentsDisabled;

    public static final ImageVector getCommentsDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _commentsDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CommentsDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(6.83f, 4.0f, 20.0f, 12.0f, -1.17f);
        j50.x(i, -2.0f, -2.0f, 18.0f, -2.0f);
        r6.t(i, -3.17f, -1.0f, -1.0f, 18.0f);
        uo.u(i, 9.0f, -6.17f, -1.0f, -1.0f);
        fc.q(i, 18.0f, 6.0f, 8.83f);
        uo.l(i, 6.83f, 4.0f, 13.17f, 16.0f);
        j50.x(i, -2.0f, -2.0f, 6.0f, -2.0f);
        r6.t(i, 3.17f, -1.0f, -1.0f, 6.0f);
        i.verticalLineTo(9.0f);
        i.horizontalLineToRelative(0.17f);
        i.lineTo(4.0f, 6.83f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(i, 16.0f, 13.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = bv.c(18.83f, 16.0f, 20.0f, 4.0f, 6.83f);
        c.lineToRelative(-2.0f, -2.0f);
        c.horizontalLineTo(20.0f);
        c.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        gy.B(c, 0.0f, 15.17f, 18.83f, 16.0f);
        c.moveTo(18.0f, 6.0f);
        fc.z(c, 8.83f, 2.0f, 2.0f, 18.0f);
        k4.D(c, 6.0f, 18.0f, 9.0f, -6.17f);
        c.lineToRelative(2.0f, 2.0f);
        c.horizontalLineTo(18.0f);
        c.verticalLineTo(9.0f);
        c.close();
        bv.y(c, 18.0f, 14.0f, -2.0f, -3.17f);
        gy.w(c, 2.0f, 2.0f, 18.0f);
        c.moveTo(21.9f, 21.9f);
        c.lineToRelative(-1.41f, 1.41f);
        c.lineTo(15.17f, 18.0f);
        c.horizontalLineTo(4.0f);
        c.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        c.verticalLineTo(4.83f);
        c.lineTo(0.69f, 3.51f);
        r6.C(c, 2.1f, 2.1f, 21.9f, 21.9f);
        c.moveTo(13.17f, 16.0f);
        j50.x(c, -2.0f, -2.0f, 6.0f, -2.0f);
        r6.t(c, 3.17f, -1.0f, -1.0f, 6.0f);
        c.verticalLineTo(9.0f);
        c.horizontalLineToRelative(0.17f);
        c.lineTo(4.0f, 6.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(c, 16.0f, 13.17f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commentsDisabled = build;
        build.getClass();
        return build;
    }
}
