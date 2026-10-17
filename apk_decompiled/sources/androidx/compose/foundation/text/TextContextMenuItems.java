package androidx.compose.foundation.text;

import androidx.compose.foundation.text.ContextMenuIcons;
import androidx.compose.foundation.text.ContextMenuStrings;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuItems {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES;
    public static final TextContextMenuItems Autofill;
    public static final TextContextMenuItems Copy;
    public static final TextContextMenuItems Cut;
    public static final TextContextMenuItems Paste;
    public static final TextContextMenuItems SelectAll;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    private static final /* synthetic */ TextContextMenuItems[] $values() {
        return new TextContextMenuItems[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        TextContextMenuKeys textContextMenuKeys = TextContextMenuKeys.INSTANCE;
        Object cutKey = textContextMenuKeys.getCutKey();
        ContextMenuStrings.Companion companion = ContextMenuStrings.Companion;
        int m1108getCut9Hzcbyc = companion.m1108getCut9Hzcbyc();
        ContextMenuIcons.Companion companion2 = ContextMenuIcons.Companion;
        Cut = new TextContextMenuItems("Cut", 0, cutKey, m1108getCut9Hzcbyc, companion2.m1095getActionModeCutDrawable3I4p1mQ());
        Copy = new TextContextMenuItems("Copy", 1, textContextMenuKeys.getCopyKey(), companion.m1107getCopy9Hzcbyc(), companion2.m1094getActionModeCopyDrawable3I4p1mQ());
        Paste = new TextContextMenuItems("Paste", 2, textContextMenuKeys.getPasteKey(), companion.m1109getPaste9Hzcbyc(), companion2.m1096getActionModePasteDrawable3I4p1mQ());
        SelectAll = new TextContextMenuItems("SelectAll", 3, textContextMenuKeys.getSelectAllKey(), companion.m1110getSelectAll9Hzcbyc(), companion2.m1097getActionModeSelectAllDrawable3I4p1mQ());
        Autofill = new TextContextMenuItems("Autofill", 4, textContextMenuKeys.getAutofillKey(), companion.m1106getAutofill9Hzcbyc(), companion2.m1098getID_NULL3I4p1mQ());
        TextContextMenuItems[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private TextContextMenuItems(String str, int i, Object obj, int i2, int i3) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    /* renamed from: getDrawableId-3I4p1mQ, reason: not valid java name */
    public final int m1162getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* renamed from: getStringId-9Hzcbyc, reason: not valid java name */
    public final int m1163getStringId9Hzcbyc() {
        return this.stringId;
    }

    public final String resolvedString(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(479426150, i, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (CommonContextMenuArea.kt:178)");
        }
        String m1111getStringtk4Tqcs = ContextMenuStrings_androidKt.m1111getStringtk4Tqcs(this.stringId, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1111getStringtk4Tqcs;
    }
}
