package androidx.compose.runtime;

import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace;
import androidx.compose.runtime.composer.linkbuffer.SlotTableReader;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.gy;
import defpackage.ky;
import defpackage.m50;
import defpackage.q10;
import defpackage.rl0;
import defpackage.sl0;
import defpackage.uf;
import defpackage.ut;
import defpackage.xe0;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkComposerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    public static final LinkComposer asLinkComposer(Composer composer) {
        LinkComposer linkComposer = composer instanceof LinkComposer ? (LinkComposer) composer : null;
        if (linkComposer != null) {
            return linkComposer;
        }
        throw uf.a("Inconsistent composition");
    }

    public static final LinkRememberObserverHolder asLinkRememberObserverHolder(RememberObserverHolder rememberObserverHolder) {
        LinkRememberObserverHolder linkRememberObserverHolder = rememberObserverHolder instanceof LinkRememberObserverHolder ? (LinkRememberObserverHolder) rememberObserverHolder : null;
        if (linkRememberObserverHolder != null) {
            return linkRememberObserverHolder;
        }
        throw uf.a("Inconsistent composition");
    }

    private static final <T> rl0 buildScatterSet(ky kyVar) {
        gb0 gb0Var = sl0.a;
        gb0 gb0Var2 = new gb0();
        kyVar.invoke(gb0Var2);
        return gb0Var2;
    }

    private static final boolean childOf(SlotTableAddressSpace slotTableAddressSpace, int i, int i2) {
        int[] groups = slotTableAddressSpace.getGroups();
        int i3 = i2;
        while (true) {
            if (i3 <= 0) {
                if (!(i3 != 0)) {
                    gy.h(i2, "Traversing parent of group not in the slot table: ");
                }
                return false;
            }
            if (i3 == i) {
                return true;
            }
            i3 = groups[i3 + 2];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, int i) {
        boolean z;
        int i2;
        ArrayList arrayList = new ArrayList();
        SlotTableReader openReader = slotTable.openReader();
        try {
            SlotTableAddressSpace slotTableAddressSpace = openReader.addressSpace;
            if (i >= 0) {
                IntStack intStack = new IntStack();
                int[] groups = slotTableAddressSpace.getGroups();
                int i3 = i;
                while (true) {
                    if (openReader.isNode(i3)) {
                        arrayList.add(openReader.node(i3));
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i3 != i && (i2 = groups[i3 + 1]) >= 0) {
                        intStack.push(i2);
                    }
                    i3 = groups[i3 + 3];
                    if (!z || i3 < 0) {
                        if (intStack.tos == 0) {
                            break;
                        }
                        i3 = intStack.pop();
                    }
                }
            }
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final int findFirstSibling(SlotTableAddressSpace slotTableAddressSpace, int i, int i2, int i3) {
        if (i2 != -1) {
            if (i3 != -1) {
                int[] groups = slotTableAddressSpace.getGroups();
                for (int i4 = groups[i + 3]; i4 > 0; i4 = groups[i4 + 1]) {
                    if (i4 != i2) {
                        if (i4 != i3) {
                        }
                    }
                }
                throw uf.a("Unexpected slot table structure");
            }
            return i2;
        }
        return i3;
    }

    /* renamed from: findInvalidations-Vpaz1Sg, reason: not valid java name */
    public static final List<xe0> m3848findInvalidationsVpaz1Sg(SlotTableReader slotTableReader, int i, fb0 fb0Var) {
        int i2;
        if (ScopeMap.m3928isEmptyimpl(fb0Var)) {
            return ut.d;
        }
        m50 o = y80.o();
        gb0 gb0Var = sl0.a;
        gb0 gb0Var2 = new gb0();
        SlotTableAddressSpace addressSpace = slotTableReader.getTable().getAddressSpace();
        if (i >= 0) {
            IntStack intStack = new IntStack();
            int[] groups = addressSpace.getGroups();
            int i3 = i;
            while (true) {
                RecomposeScopeImpl recomposeScopeOrNull = getRecomposeScopeOrNull(slotTableReader, i3);
                if (recomposeScopeOrNull != null) {
                    gb0Var2.d(recomposeScopeOrNull);
                }
                if (i3 != i && (i2 = groups[i3 + 1]) >= 0) {
                    intStack.push(i2);
                }
                i3 = groups[i3 + 3];
                if (i3 < 0) {
                    if (intStack.tos == 0) {
                        break;
                    }
                    i3 = intStack.pop();
                }
            }
        }
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            obj.getClass();
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            if (gb0Var2.a(recomposeScopeImpl)) {
                                o.add(new xe0(recomposeScopeImpl, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return y80.d(o);
    }

    public static final Integer findSubcompositionContextGroup(SlotTable slotTable, CompositionContext compositionContext) {
        int i;
        SlotTableReader openReader = slotTable.openReader();
        try {
            int root = slotTable.getRoot();
            int firstChildOf = openReader.firstChildOf(root);
            loop0: while (firstChildOf != -1) {
                if ((slotTable.groupFlags$runtime(firstChildOf) & GroupFlagsKt.IsSubcompositionContextFlag) == 1073741824 && (i = slotTable.getGroups()[firstChildOf + 5]) != -1) {
                    SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
                    int i2 = (i & 15) + 1;
                    int i3 = i >> 4;
                    if (i2 > 15) {
                        i2 = addressSpace.getLargeSizes().d(i3);
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        Object obj = slotTable.getSlots()[i3 + i4];
                        if (q10.b(obj, Composer.Companion.getEmpty())) {
                            break;
                        }
                        RememberObserverHolder rememberObserverHolder = obj instanceof RememberObserverHolder ? (RememberObserverHolder) obj : null;
                        RememberObserver wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
                        LinkComposer.CompositionContextHolder compositionContextHolder = wrapped instanceof LinkComposer.CompositionContextHolder ? (LinkComposer.CompositionContextHolder) wrapped : null;
                        if (compositionContextHolder != null && q10.b(compositionContextHolder.getRef(), compositionContext)) {
                            Integer valueOf = Integer.valueOf(firstChildOf);
                            openReader.close();
                            return valueOf;
                        }
                    }
                }
                int firstChildOf2 = openReader.firstChildOf(firstChildOf);
                if (firstChildOf2 == -1 || (slotTable.groupFlags$runtime(firstChildOf) & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    int i5 = firstChildOf;
                    firstChildOf = openReader.nextSiblingOf(firstChildOf);
                    while (firstChildOf == -1) {
                        i5 = openReader.parentOf(i5);
                        if (i5 == -1 || i5 == root) {
                            break loop0;
                        }
                        firstChildOf = openReader.nextSiblingOf(i5);
                    }
                } else {
                    firstChildOf = firstChildOf2;
                }
            }
            return null;
        } finally {
            openReader.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r2 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r3 == r2) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long firstGroupInTopologicalOrder(SlotTable slotTable, long j, long j2) {
        int group;
        int group2;
        if (j != j2) {
            SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
            int[] groups = addressSpace.getGroups();
            if (GroupHandleKt.getGroup(j) != -1) {
                group = GroupHandleKt.getGroup(j);
            } else if (GroupHandleKt.getGroup(j2) == -1) {
                group = GroupHandleKt.getContext(j);
            } else {
                int context = GroupHandleKt.getContext(j);
                int group3 = GroupHandleKt.getGroup(j2);
                int[] groups2 = addressSpace.getGroups();
                int i = group3;
                while (i > 0) {
                    if (i == context) {
                        return j2;
                    }
                    i = groups2[i + 2];
                }
                if (!(i != 0)) {
                    gy.h(group3, "Traversing parent of group not in the slot table: ");
                }
                group = GroupHandleKt.getContext(j);
            }
            if (GroupHandleKt.getGroup(j2) != -1) {
                group2 = GroupHandleKt.getGroup(j2);
            } else if (GroupHandleKt.getGroup(j) == -1) {
                group2 = GroupHandleKt.getContext(j2);
            } else {
                int context2 = GroupHandleKt.getContext(j2);
                int group4 = GroupHandleKt.getGroup(j);
                int[] groups3 = addressSpace.getGroups();
                int i2 = group4;
                while (i2 > 0) {
                    if (i2 == context2) {
                        return j;
                    }
                    i2 = groups3[i2 + 2];
                }
                if (!(i2 != 0)) {
                    gy.h(group4, "Traversing parent of group not in the slot table: ");
                }
                group2 = GroupHandleKt.getContext(j2);
            }
            if (group != group2) {
                int i3 = group == -1 ? -1 : groups[group + 2];
                int i4 = group2 != -1 ? groups[group2 + 2] : -1;
                if (i3 != group2) {
                    if (i4 != group) {
                        if (i3 != i4) {
                            int distanceFrom$runtime = addressSpace.distanceFrom$runtime(group, slotTable.getRoot());
                            int distanceFrom$runtime2 = addressSpace.distanceFrom$runtime(group2, slotTable.getRoot());
                            if (distanceFrom$runtime > distanceFrom$runtime2) {
                                int i5 = distanceFrom$runtime - distanceFrom$runtime2;
                                int i6 = 0;
                                while (i6 < i5) {
                                    i6++;
                                    int i7 = i3;
                                    i3 = groups[i3 + 2];
                                    group = i7;
                                }
                            } else {
                                int i8 = distanceFrom$runtime2 - distanceFrom$runtime;
                                int i9 = 0;
                                while (i9 < i8) {
                                    i9++;
                                    int i10 = i4;
                                    i4 = groups[i4 + 2];
                                    group2 = i10;
                                }
                            }
                            int i11 = i4;
                            int i12 = group2;
                            int i13 = group;
                            int i14 = i3;
                            for (int i15 = i11; i14 != i15; i15 = groups[i15 + 2]) {
                                int i16 = i14;
                                i14 = groups[i14 + 2];
                                i13 = i16;
                                i12 = i15;
                            }
                            i3 = i14;
                            group2 = i12;
                            group = i13;
                        }
                        if (!(group != group2)) {
                            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
                        }
                        int findFirstSibling = findFirstSibling(addressSpace, i3, group, group2);
                        if (findFirstSibling != group) {
                            if (findFirstSibling != group2) {
                                throw uf.a("Unexpected slot table structure");
                            }
                        }
                    }
                }
                return j2;
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (q10.b(joinedKey.getLeft(), obj2) && q10.b(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    public static final RecomposeScopeImpl getRecomposeScopeOrNull(SlotTableReader slotTableReader, int i) {
        Object orNull = slotTableReader.getOrNull(i, 0);
        if (orNull instanceof RecomposeScopeImpl) {
            return (RecomposeScopeImpl) orNull;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInsertHandle(long j) {
        return GroupHandleKt.getGroup(j) < -8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> fb0 multiMap(int i) {
        return MultiValueMap.m3894constructorimpl(new fb0(i));
    }

    private static final long toGroupHandle(int i) {
        return i & 4294967295L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toInsertAddress(long j) {
        return (((-10) - GroupHandleKt.getGroup(j)) & 4294967295L) | (GroupHandleKt.getContext(j) << 32);
    }

    private static final long toGroupHandle(long j) {
        isInsertHandle(j);
        return j;
    }

    public static final ReusableLinkRememberObserverHolder asLinkRememberObserverHolder(ReusableRememberObserverHolder reusableRememberObserverHolder) {
        ReusableLinkRememberObserverHolder reusableLinkRememberObserverHolder = reusableRememberObserverHolder instanceof ReusableLinkRememberObserverHolder ? (ReusableLinkRememberObserverHolder) reusableRememberObserverHolder : null;
        if (reusableLinkRememberObserverHolder != null) {
            return reusableLinkRememberObserverHolder;
        }
        throw uf.a("Inconsistent composition");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }
}
