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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChecklistRtlKt {
    private static ImageVector _checklistRtl;

    public static final ImageVector getChecklistRtl(Icons.Outlined outlined) {
        ImageVector imageVector = _checklistRtl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ChecklistRtl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(11.0f, 7.0f, 2.0f, 2.0f, 9.0f);
        k4.B(i, 7.0f, 11.0f, 15.0f, 2.0f);
        k4.p(i, 2.0f, 9.0f, 15.0f);
        i.moveTo(16.34f, 11.0f);
        i.lineToRelative(-3.54f, -3.54f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineToRelative(4.24f, -4.24f);
        r6.C(i, 22.0f, 5.34f, 16.34f, 11.0f);
        i.moveTo(16.34f, 19.0f);
        i.lineToRelative(-3.54f, -3.54f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineToRelative(4.24f, -4.24f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 22.0f, 13.34f, 16.34f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _checklistRtl = build;
        build.getClass();
        return build;
    }
}
