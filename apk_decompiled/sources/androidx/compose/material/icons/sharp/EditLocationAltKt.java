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
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationAltKt {
    private static ImageVector _editLocationAlt;

    public static final ImageVector getEditLocationAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _editLocationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EditLocationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(13.95f, 13.0f, 9.0f, 8.05f);
        c.lineToRelative(5.61f, -5.61f);
        c.curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f);
        c.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        c.curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f);
        c.curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f);
        c.curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f);
        uo.l(c, 13.95f, 13.0f, 11.0f, 11.0f);
        c.horizontalLineToRelative(2.12f);
        c.lineToRelative(6.16f, -6.16f);
        c.lineToRelative(-2.12f, -2.12f);
        uf.o(c, 11.0f, 8.88f, 11.0f);
        c.moveTo(19.29f, 0.59f);
        c.lineToRelative(-1.42f, 1.42f);
        c.lineToRelative(2.12f, 2.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(c, 1.42f, -1.42f, 19.29f, 0.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocationAlt = build;
        build.getClass();
        return build;
    }
}
