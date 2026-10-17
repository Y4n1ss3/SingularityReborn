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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FolderSpecialKt {
    private static ImageVector _folderSpecial;

    public static final ImageVector getFolderSpecial(Icons.TwoTone twoTone) {
        ImageVector imageVector = _folderSpecial;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FolderSpecial", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(11.17f, 8.0f, -2.0f, -2.0f, 4.0f);
        u.verticalLineToRelative(12.0f);
        u.horizontalLineToRelative(16.0f);
        u.verticalLineTo(8.0f);
        u.horizontalLineToRelative(-8.83f);
        u.close();
        u.moveTo(15.0f, 9.0f);
        u.lineToRelative(1.19f, 2.79f);
        u.lineToRelative(3.03f, 0.26f);
        u.lineToRelative(-2.3f, 1.99f);
        u.lineToRelative(0.69f, 2.96f);
        u.lineTo(15.0f, 15.47f);
        u.lineTo(12.39f, 17.0f);
        u.lineToRelative(0.69f, -2.96f);
        u.lineToRelative(-2.3f, -1.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(u, 3.03f, -0.26f, 15.0f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 6.0f, -8.0f, -2.0f, -2.0f);
        i.lineTo(4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 8.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 20.0f, 18.0f, 4.0f, 18.0f);
        i.lineTo(4.0f, 6.0f);
        i.horizontalLineToRelative(5.17f);
        i.lineToRelative(2.0f, 2.0f);
        bv.r(i, 20.0f, 8.0f, 10.0f);
        i.moveTo(13.08f, 14.04f);
        i.lineTo(12.39f, 17.0f);
        i.lineTo(15.0f, 15.47f);
        i.lineTo(17.61f, 17.0f);
        i.lineToRelative(-0.69f, -2.96f);
        i.lineToRelative(2.3f, -1.99f);
        i.lineToRelative(-3.03f, -0.26f);
        i.lineTo(15.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, -1.19f, 2.79f, -3.03f, 0.26f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderSpecial = build;
        build.getClass();
        return build;
    }
}
