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
import defpackage.er;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InsertCommentKt {
    private static ImageVector _insertComment;

    public static final ImageVector getInsertComment(Icons.TwoTone twoTone) {
        ImageVector imageVector = _insertComment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.InsertComment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.0f, 16.0f, 14.83f, 20.0f, 17.17f);
        p.lineTo(20.0f, 4.0f);
        bv.r(p, 4.0f, 4.0f, 12.0f);
        k4.C(p, 6.0f, 6.0f, 12.0f, 2.0f);
        r6.C(p, 6.0f, 8.0f, 6.0f, 6.0f);
        k4.C(p, 6.0f, 9.0f, 12.0f, 2.0f);
        r6.C(p, 6.0f, 11.0f, 6.0f, 9.0f);
        k4.C(p, 6.0f, 12.0f, 12.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(p, 6.0f, 14.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 2.0f, 4.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.lineToRelative(4.0f, 4.0f);
        i.lineTo(22.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        bv.v(i, 20.0f, 4.0f, 13.17f);
        i.lineTo(18.83f, 16.0f);
        i.lineTo(4.0f, 16.0f);
        uf.j(i, 4.0f, 4.0f, 16.0f);
        k4.C(i, 6.0f, 12.0f, 12.0f, 2.0f);
        uo.l(i, 6.0f, 14.0f, 6.0f, 9.0f);
        j50.o(i, 12.0f, 2.0f, 6.0f, 11.0f);
        k4.C(i, 6.0f, 6.0f, 12.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 6.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertComment = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getInsertComment$annotations(Icons.TwoTone twoTone) {
    }
}
