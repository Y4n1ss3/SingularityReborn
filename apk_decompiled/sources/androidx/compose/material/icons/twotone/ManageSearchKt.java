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
import defpackage.er;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ManageSearchKt {
    private static ImageVector _manageSearch;

    public static final ImageVector getManageSearch(Icons.TwoTone twoTone) {
        ImageVector imageVector = _manageSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ManageSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(2.0f, 12.0f, 5.0f, 2.0f, -5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.17f, 13.75f);
        b.curveTo(18.69f, 12.96f, 19.0f, 12.02f, 19.0f, 11.0f);
        b.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        b.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.curveToRelative(1.02f, 0.0f, 1.96f, -0.31f, 2.76f, -0.83f);
        b.lineTo(20.59f, 19.0f);
        r6.C(b, 22.0f, 17.59f, 18.17f, 13.75f);
        b.moveTo(14.0f, 14.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        b.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        b.curveTo(17.0f, 12.65f, 15.65f, 14.0f, 14.0f, 14.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(2.0f, 7.0f, 5.0f, 2.0f, -5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(2.0f, 17.0f, 10.0f, 2.0f, -10.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageSearch = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getManageSearch$annotations(Icons.TwoTone twoTone) {
    }
}
